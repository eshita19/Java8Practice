# Java8 Features

## 1. Interface Enhancement
## 2. Lambda Expression
## 3. Streams:
   * Operates on a data source - Arrays or Collection.
   * Performs operation on data source such as sort, filter, iteration and others.
   * It doesn't modify the main datasource. Terminal result of a stream is - Another stream or a result(count, min, max)
      #### Stream Interfaces
      * Defined in java.util.stream.
      * interface BaseStram<T, S extends BaseStream <T,S>> ( Extends AutoCloseable)
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
  
  
          
     
   
