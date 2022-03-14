(ns clojure-estudo.refs)

;Reference values are another way Clojure can work with the demand to have mutable variables.
; Clojure provides mutable data types such as atoms, agents, and reference types.


;This is used to create a reference value. When creating a reference value,
; there is an option to provide a validator function, which will validate the value created.
(defn Example1 []
  (def my-ref (ref 1 :validator pos?))
  (println @my-ref))
(Example1)

(defn Example2 []
  "Da erro pois o validador verifica que nao eh positivo"
  (def my-ref (ref -1 :validator pos?))
  (println @my-ref))
(Example2)

(defn Example3 []
  "Atribui desde que seja par"
  (def my-ref (ref 2 :validator even?))
  (println @my-ref))
(Example3)


(defn Example4 []
  "Atribui desde que seja par"
  (def my-ref (ref 3 :validator even?))
  (println @my-ref))
(Example4)


(defn Example5 []
  "Não precisa ter opcoes sempre"
  (def my-ref (ref 3))
  (println @my-ref))
(Example5)


;This function is used to set the value of a reference to a new value irrespective of whatever is the older value.
(defn Example6 []
  (def my-ref (ref 1 :validator pos?))
  (dosync
    (ref-set my-ref 2))
  (println @my-ref))
(Example6)


;This function is used to alter the value of a reference type but in a safe manner.
; This is run in a thread, which cannot be accessed by another process. This is why the command needs to be associated
; with a ‘dosync’ method always. Secondly, to change the value of a reference type, a function needs to be called to
; make the necessary change to the value.
(defn Example7 []
  (def names (ref []))

  (defn change [newname]
    (dosync
      (alter names conj newname)))

  (change "John")
  (change "Mark")
  (println @names))
(Example7)

;dosync é uma forma segura de realizar uma operacao. Executa em um thread apartada. "transação".




;Commute is also used to change the value of a reference type just like alter and ref-set. The only difference is that
; this also needs to be placed inside a ‘dosync’ block. However, this can be used whenever there is no need to know
; which calling process actually changed the value of the reference type. Commute also uses a function to change the
; value of the reference variable.
(defn Example8 []
  (def counter (ref 0))

  (defn change [counter]
    (dosync
      (commute counter inc)))
  (change counter)
  (println @counter)

  (change counter)
  (println @counter))
(Example8)

