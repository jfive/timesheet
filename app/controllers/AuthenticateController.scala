package controllers

import play.api.data._
import play.api.data.Forms._
import play.api.mvc._


object AuthenticateController extends Controller {

  val loginForm = Form[LoginForm](
    mapping(
      "login" -> nonEmptyText,
      "senha" -> nonEmptyText
    )(LoginForm.apply)(LoginForm.unapply)
  )


  def login = Action {
    val valorPadrao: Form[LoginForm] = loginForm.fill(LoginForm("Rodrigo", "Almeida"))
    Ok(views.html.login("",valorPadrao))
  }

  def authenticate = Action{ implicit request =>
    loginForm.bindFromRequest.fold(
      formWithErrors => BadRequest("Login ou senha Inválidos"),
      filter => Ok("Login e senha válidos " + filter.login + " - " + filter.senha)
    )
  }

}

case class LoginForm(login : String, senha : String)

