# Java8 Features

## 1. Interface Enhancement - 
   * Code Link[https://github.com/eshita19/Java8Practice/tree/master/src/com/java8/interfaces]
   * **Default Methods** :
      * Interface can have implementation of methods declared as default.
      `interface Moveable {
          void moveLeft();
          default void moveRight(){
            System.out.println("This is default implementation")
          }
       }`
      * If interface needs to be extended without breaking classes implementing it, default methods is good option.
   * **Static Methods** :
      * Interface can have static methods. It can be called directly: MyInterface.aMethod()
## 2. Lambda Expression
## 3. Streams:
   * Code Link[https://github.com/eshita19/Java8Practice/tree/master/src/com/java8/streams]
   * Operates on a data source - Arrays or Collection.
   * Performs operation on data source such as sort, filter, iteration and others.
   * It doesn't modify the main datasource. Terminal result of a stream is - Another stream or a result(count, min, max)
      #### Stream Interfaces
      * Defined in java.util.stream.
      * **interface BaseStream<T, S extends BaseStream <T,S>>**   ( Extends AutoCloseable)
        * T - Type of elements in the stream
        * S - Stream
        * Main methods:
          * void close() - Closes the invoking stream, calling any registered call handlers.
          * boolean isParallel() - Returns true if the invoking stream is parallel, otherwise false.
          * Iterator<T> iterator - Obtains an iterator to stream(Terminal operation).
          * S onClose(Runnable handler) - Returns a new stream with the close handler specified by handler.
          * S paraller() - Returns a paraller stream.
          * S sequential() - Returns a squerntial stream.
          * SplitIterator<T> splitIterator - Obtains a SplitIterator to stream (Terminal operation).
          * S unorderd() - Returns an unorderd stream based on the invoking stream.
  
     * **interface Stream<T>** (Extends BaseStream)
       * <R, A> R collect(Collector<? super T, A, R> collectorFunc) - collects elements into a container which is changeable.
       * long count() - Counts the number of elements in the stream.
       * Stream<T> filter(Predicate<? super T> pred) - Returns a  new stream after applying filter function on the input stream(Can use paraller stream as op on each element is independent).
       * void forEach(Consumer<? super T> action) - For each element execute action specified in Consumer function.
       * <R> Stream<R> map(Function<? super T, ? extends R> mapFunc) - Returns a new stream after applying mapFunc for each element in input stream.
         * mapToDouble 
         * mapToInt
         * mapToLong
       * Optional<T> max(Comparator<? super T> comp) - Using ordering specified in comp, finds and returns the max element.
       * Optional<T> min(Comparator<? super T> comp) - Using ordering specified in comp, finds and returns the min element.
       * T reduce(T identityval, BinaryOperator<T> accumlator) - Returns a result based on the elements in invoking stream.
       * Stream<T> sorted() - Returns new stream with elements sorted in natural order.
       * Object[] toArray() - Creates an array of elements from stream.

   * **Terminal operation vs intermediate operations** : Terminal operations consumes stream and produces a result(count, sorted, toArray). Intermediate operations consumes a stream and produces a new stream(filter, map, reduce)
   * **Reduction operations**: These operations reduces the stream data to a single value(count, min, max) 
      Optional<T> reduce(BinaryOperator<T> accumlator)
      T reduce(T identityVal, BinaryOperator<T> accumlator)
   * **Collectors operations** : Convert stream to Collection. (Collectors.toList & Collectors.toSet)
  
  
          
     
   
