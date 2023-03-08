# Choral Evaluation Code Repository

# Comparison With Java and Akka

The folder "compare" contains the code used to compare both qualitatively and quantitatively Choral with Java and Akka. 

Starting from the Java implementation of the Karatsuba algorithm (under compare/src/main/java/Benchmarks/Java/Karatsuba/Karatsuba.java) we implement it in Choral (compiled Choral-compiled Java code under compare/src/main/java/Benchmarks/Choral/Karatsuba/) and in Akka (under compare/src/main/java/Benchmarks/Akka/Karatsuba).

The folder compare/src/main/java/Benchmarks/Akka also contains the implementations of the DistAuth (compare/src/main/java/Benchmarks/Akka/DistAuth) and MergeSort (compare/src/main/java/Benchmarks/Akka/MergeSort) examples, used for qualitatively compare the source code of Akka and Choral.

# Benchmarks

The folder "tests" contains 11 benchmark tests for the Choral compiler.
The Choral sources used in the benchmark are "BuyerSellerShipper", "ConsumeItems", "DiffieHellman", "DistAuth", "HelloRoles", "Karatsuba", "Mergesort", "Quicksort", "VitalsStreaming" found under tests/src/main/choral/examples. The additional folders, "AuthResult" and "BiPair" contain libraries used by some of the benchmarks.

Under "tests/src/main/java/choral/examples" there are the Java sources compiled from the mentioned Choral programs (these are reported for reference since the benchmarks re-create them at each run). The file "TestChoral.java" contains the logic to automate running the benchmarks over all or part of the Choral sources.