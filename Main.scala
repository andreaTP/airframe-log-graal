
object Main {

  def main(args: Array[String]): Unit = {
    val logLevel = wvlet.log.LogLevel("info")

    CliLogger.logger.setLogLevel(logLevel)
    SbtLogger.logger.setLogLevel(logLevel)
    CodeLogger.logger.setLogLevel(logLevel)


    CliLogger.logger.info("Hello")
    SbtLogger.logger.warn("world")
    CodeLogger.logger.error("GraalVM")
  }

}
