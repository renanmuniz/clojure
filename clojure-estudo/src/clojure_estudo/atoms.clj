(ns clojure-estudo.atoms)

;Atoms are a data type in Clojure that provide a way to manage shared, synchronous, independent state.
; An atom is just like any reference type in any other programming language.
; The primary use of an atom is to hold Clojure’s immutable datastructures.
; The value held by an atom is changed with the swap! method.

;Atoms are created with the help of the atom method. An example on the same is shown in the following program.

;The value of atom is accessed by using the @ symbol.

(defn example []
  (def myatom (atom 1))
  (println @myatom))
(example)


;reset!
;Sets the value of atom to a new value without regard for the current value.
(defn reset [x]
  (def myatom (atom 1))
  (println @myatom)

  (reset! myatom x)
  (println @myatom))
(reset 10)

(defn reset2 [x]
  (def myatom (atom 1))
  (println @myatom)

  (reset! myatom (+ 5 (* x 2)))
  (println @myatom))
(reset2 10)


;compare-and-set!
;Atomically sets the value of atom to the new value if and only if the current value of the atom is
; identical to the old value held by the atom. Returns true if set happens, else it returns false.

(defn compare-and-set []
  (def myatom (atom 1))
  (println @myatom)

  (compare-and-set! myatom 0 3)
  (println @myatom)

  (compare-and-set! myatom 1 3)
  (println @myatom))
(compare-and-set)


;swap!
;Atomically swaps the value of the atom with a new one based on a particular function.

(defn swap1 []
  (def myatom (atom 1))
  (println @myatom)

  (swap! myatom inc)
  (println @myatom))
(swap1)


(defn swapErro []
  (def myatom (atom 1))
  (println @myatom)

  (swap! myatom 2)                                          ;ERRO! Não pode setar sem ser por alguma funcao
  (println @myatom))
(swapErro)
