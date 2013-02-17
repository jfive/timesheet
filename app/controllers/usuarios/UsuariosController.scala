package controllers.usuarios

import play.api.mvc._

/**
 * Created with IntelliJ IDEA.
 * User: rodrigoalmeida
 * Date: 15/02/13
 * Time: 23:51
 * To change this template use File | Settings | File Templates.
 */
object UsuariosController extends Controller{

  def index = Action {
    Ok(views.html.usuarios())
  }


}
