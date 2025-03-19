trait SimpleLinkedList[T]:
   def isEmpty: Boolean
   def value: T
   def add(item: T): SimpleLinkedList[T]
   def next: SimpleLinkedList[T]
   def reverse: SimpleLinkedList[T]
   def toSeq: Seq[T]

case object Empty extends SimpleLinkedList:
   
case class NonEmpty[T]() extends SimpleLinkedList:

object SimpleLinkedList:

   def fromSeq[T](ts: Seq[T]): List[T] = ???

   def apply[T](): SimpleLinkedList[T] = ???

   def empty[T]: SimpleLinkedList[T] = ???
