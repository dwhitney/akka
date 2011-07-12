package akka.agent

trait Watcher[T]{
  val id: String
  def watch(agent: Agent[T], oldValue: T): Unit
}