package controllers

import javax.inject._
import models.Index
import play.api.mvc._

class IndexController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index() = Action {
    val hello = Index.sayHello
    Ok(hello)
  }

}