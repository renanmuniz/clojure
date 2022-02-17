(ns clojure-estudo.condicionais)


; if
(defn TesteIf1 [] (
                   if ( = 2 2)
                   (println "Valores sao iguais")
                   (println "Valores sao diferentes")))
(TesteIf1)

(defn TesteIf2 [] (
                             if (= 0 (rem 5 2) )
                             (println "par")
                             (println "impar")
                             ))
(TesteIf2)

(defn TesteIf3 [] (
                             if (= 0 (rem 6 2) )
                             (println "par")
                             (println "impar")
                             ))
(TesteIf3)



;if-do  -  a diferenca pro if de cima é que suporta um bloco de execucao com varias acoes

(defn TesteIfDo [] (
                   if (= 2 2)
                   (do
                     (println "Both the values are equal")
                     (println "true")
                   )
                   (do
                     (println "Both the values are not equal")
                     (println "false")
                   )
                   )
)
(TesteIfDo)

(defn TesteIfDo2 [] (
                      if (= 0 (rem 6 2) )
                     (do
                       (println "O valor é:")
                       (println "par"))
                     (do
                       (println "O valor é:")
                       (println "impar"))
                     )
)
(TesteIfDo2)



; if aninhado

(defn TesteIfAninhado [] (
                   if ( and (= 2 2) (= 3 3))
                   (println "Values are equal")
                   (println "Values are not equal")))
(TesteIfAninhado)

(defn TesteIfAninhado2 [] (
                   if ( and (> 1 2) (= 1 (rem 3 2)))
                   (println "3 maior que 2 e é impar")
                   (println "menor que dois ou par")))
(TesteIfAninhado2)



; Case

(defn TesteCase []
  (def x 5)
  (case x 5 (println "x is 5")
          10 (println "x is 10")
          (println "x is neither 5 nor 10")))
(TesteCase)


(defn TesteCase2 []
  (def var 6)
  (case var 1 (println " = 1")
            2 (println " = 2")
            3 (println " = 3")
            4 (println " = 4")
            5 (println " = 5")
            (println "Nenhum desses")
            )
)
(TesteCase2)

(defn TesteCase3 []
  (def var 6)
  (case var 1 (println " = 1")
            2 (println " = 2")
            3 (println " = 3")
            4 (println " = 4")
            5 (println " = 5")
            (println "Nenhum desses")
            )
  )
(TesteCase3)


; cond     ;executa verificacoes e executa assim que encontrar alguma que satisfaca
; as outras condicoes nao sao avaliadas apos alguma anterior satisfazer a condicao.

(defn TesteCond []
  (def x 10)
  (cond
    (= 0 (rem x 2)) (println "é par")
    (= x 5) (println "x is 5")
    (= x 10)(println "x is 10")
    :else (println "x is not defined")))
(TesteCond)


(defn TesteCond2 []
  (def x 10)
  (cond
    (= x 5) (println "x is 5")
    (= x 10)(println "x is 10")
    (= 0 (rem x 2)) (println "é par")
    :else (println "x is not defined")))
(TesteCond2)


(defn TesteCond3 []
  (def x 11)
  (cond
    (= x 5) (println "x is 5")
    (= x 10)(println "x is 10")
    (= 0 (rem x 2)) (println "é par")
    :else (println "x is not defined")))
(TesteCond3)


