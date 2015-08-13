/**
 * Created by z1 on 8/13/15.
 */

import sbt._

object DesignPatternsScala extends Build {

  lazy val root = project.in(file(".")).aggregate(singleton, strategy)

  lazy val singleton = project

  lazy val strategy = project
}
