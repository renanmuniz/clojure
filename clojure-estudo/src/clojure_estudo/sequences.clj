(ns clojure-estudo.sequences)

(defn AdicionaNumeroNaSequence []
  (println (cons 8 (seq [1 2 3]))))
(AdicionaNumeroNaSequence)

(defn AdicionaNumeroAoFinalSequence []
  (println (conj [1 2 3] 0)))
(AdicionaNumeroAoFinalSequence)

(defn ConcatenaSequences []
  (def seq1 (seq [1 2]))
  (def seq2 (seq [3 4]))
  (println (concat seq1 seq2)))
(ConcatenaSequences)

(defn AdicionaNaSequenceSemRepetir []
  (def seq1 (distinct (seq [1 1 2 2 3 4 5 5 6 7 7 8 9 0])))
  (println seq1))
(AdicionaNaSequenceSemRepetir)

(defn InvertePosicaoDaSequence []
  (def seq1 (reverse (seq [1 2 3])))
  (println seq1))
(InvertePosicaoDaSequence)

(defn RetornaPrimeiro []
  (def seq1 (seq [1 2 3]))
  (println (first seq1)))
(RetornaPrimeiro)

(defn RetornaUltimo []
  (def seq1 (seq [1 2 3]))
  (println (last seq1)))
(RetornaUltimo)

(defn RetornaRestoDaSequenceApos1oItem []
  (def seq1 (seq [1 2 3 4 5]))
  (println (rest seq1)))
(RetornaRestoDaSequenceApos1oItem)

(defn RetornaSequenceOrdenada []
  (def seq1 (seq [5 1 9 3 8 7 1 2 0]))
  (def seq2 (sort seq1))
  (println seq2))
(RetornaSequenceOrdenada)

(defn RetiraXItensDaSequence []
  (def seq1 (seq [5 4 3 2 1]))
  (def seq2 (drop 2 seq1))
  (println seq2))
(RetiraXItensDaSequence)

(defn RetiraXItensDaSequence2 []
  (def seq1 (seq [9 7 5 3 1]))
  (def seq2 (drop 4 seq1))
  (println seq2))
(RetiraXItensDaSequence2)

(defn RetornaXPrimeirosItensDaSequence []
  (def seq1 (seq [1 2 3 4 5 6 7 8 9 0]))
  (def seq2 (take 4 seq1))
  (println seq2))
(RetornaXPrimeirosItensDaSequence)

(defn RetornaXUltimosItensDaSequence [x]
  (def seq1 (seq [1 2 3 4 5 6 7 8 9 0]))
  (def seq2 (take-last x seq1))
  (println seq2))
(RetornaXUltimosItensDaSequence 3)

(defn DivideSequenceAPartirDoItemX [x]
  (def seq1 (seq [5 4 3 2 1]))
  (println (split-at x seq1)))
(DivideSequenceAPartirDoItemX 4)

