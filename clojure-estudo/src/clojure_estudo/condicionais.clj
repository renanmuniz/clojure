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



