(ns tipos.core)

(defn soma
  [x y]
  (+ x y))

(defn imprime-soma
  []
  (println (soma 2.0 3.0)))

(imprime-soma)
;5.0
;=> nil


(defn imprime-soma
  []
  (println (soma  "2" "3")))

(imprime-soma)
;Execution error (ClassCastException) at tipos.core/soma (core.clj:3).
;class java.lang.String cannot be cast to class java.lang.Number (java.lang.String and java.lang.Number are in module java.base of loader 'bootstrap')

(defn imprime-soma
  []
  (println (soma  nil 3)))

(imprime-soma)
;Execution error (NullPointerException) at tipos.core/soma (core.clj:3).
;Cannot invoke "Object.getClass()" because "x" is null



(type 2)
;=> java.lang.Long

(type "a")
;=> java.lang.String

(class 10)                                                  ;prefira usar type a class
;=> java.lang.Long

(type 2.0)
;=> java.lang.Double

(/ 10 3)
;=> 10/3

(type (/ 10 3))
;=> 10/3
;=> clojure.lang.Ratio

(/ 10.0 3)
;=> 3.3333333333333335

(* 3 (/ 10 3))
;=> 10N

(type (* 3 (/ 10 3)))
;=> clojure.lang.BigInt

(type 10M)
;=> java.math.BigDecimal

(type +)
;=> clojure.core$_PLUS_

(type println)
;=> clojure.core$println

