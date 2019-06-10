# Java8 Features

## 1. Interface Enhancement - 
   * Code Link[https://github.com/eshita19/Java8Practice/tree/master/src/com/java8/interfaces]
   * **Default Methods** :
      * Interface can have implementation of methods declared as default.
      * *Advantage*: If interface needs to be extended without breaking classes implementing it, default methods is good option.
      ```
      interface Moveable {
          void moveLeft();
          default void moveRight(){
            System.out.println("This is default implementation")
          }
       }
       ``` 
   * **Static Methods** :
     * Interface can have static methods. It can be only called through: MyInterface.aMethod().
     * *Advantage*: No need to create a class containing only utility methods and no state. Interface can have all utility methods. Interface static methods cannot be overriden as they are visible only through interface reference.
      ```
      interface MyUtil{
        static void isEmpty(){ };
        static void clear(){ };
      }
      ```
## 2. Optional
   * Better way to handle Null pointer exceptions and avoid null checks resulting in neat code.
   * It is a wrapper object of a value(may or may not be null).
     ```
     Optional<String> str2 = Optional.ofNullable("eshita")
     op = str2.orElse("default"); //If the transformed String is not null get it otherwise "default" string
     System.out.println(op);
      
     Optional<String> str3 = Optional.ofNullable("java") 
     if(str3.filter(str -> !str.equals("java8")).isPresent()){
    	 System.out.println("It is not equal to java 8");
     }
     ```
   * *Advantage*: Reduces code complexity added due to if blocks doing null checks.

## 3. SplitIterator
   * Code Link [https://github.com/eshita19/Java8Practice/tree/master/src/com/java8/splititerator]
     ```
        //Traditional iterator with two calls hasnext and next
		Iterator<Integer> numsIterator = nums.iterator();
		System.out.println("Printing nums from traditional Iterator");
		while(numsIterator.hasNext()){
			System.out.println(numsIterator.next());
		}
		
		//Split the list in two halfs
		Spliterator<Integer> secondSplit = nums.spliterator(); // Contains elements [3,4]
		Spliterator<Integer> firstSplit = secondSplit.trySplit(); // Contains elements [1,2]
		
		//tryAdvance: Iterates through remaining elements. Returns true if there are more elements to be iterated. No hasNext call.
		while(secondSplit.tryAdvance(n -> {
			n = n +1;
			System.out.println(n);
		}));
		
		//forEachRemaining : Iterates through remaining elements. No hasNext and next call.
		secondSplit.forEachRemaining(System.out::println);
       ```

## 4. Lambda Expression

## 5. Streams:
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
     ``` Optional<T> reduce(BinaryOperator<T> accumlator)
      T reduce(T identityVal, BinaryOperator<T> accumlator)```
   * **Collectors operations** : Convert stream to Collection. (Collectors.toList & Collectors.toSet)
  
  
          
     
   
