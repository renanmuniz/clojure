(ns clojure-estudo.loops)

; while
(defn TesteWhile []                                              ;define a funcao
  (def var (atom 1))                         ;define a variavel de controle. atom significa que valor pode ser alterado
  (while (<= @var 5)                                        ;laco de controle while usando @var declarado acima
    (do                                                     ;inicio do bloco de acao
      (println @var)                                        ;acao a ser executada (imprimir)
      (swap! var inc))))                                 ;acao a ser executada (incrementar) atom altera valor por swap!
(TesteWhile)                                                     ;Chama a execucao da funcao acima.


; doseq
(defn TesteDoseq1 []                                        ;define a funcao
  (doseq [n [0 1 2 3 4 5 6 7 8 9]]                          ;'for each' para cada valor da sequencia faca...
    (println n)))                                           ;imprime
(TesteDoseq1)                                               ;executa a funcao

(defn TesteDoseq2 []                                        ;define a funcao
  (doseq [n ["Renan" "Joao" "Jose" "Maria"]]                ;'for each' para cada valor da sequencia faca...
    (println n)))                                           ;imprime
(TesteDoseq2)                                               ;executa a funcao


; dotimes
(defn TesteDoTimes []                                       ;define a funcao
  (dotimes [n 5]                                            ;faca n vezes
    (println "imprimindo: " n)))                            ;imprime
(TesteDoTimes)                                              ;executa a funcao


; loop "for"
(defn TesteLoop []                                          ;define a funcao
  (loop [x 10]                                              ;define a variavel de controle
    (when (>= x 0)                                          ;define a condicao
      (println x)                                           ;acao
      (recur (- x 2))                                       ;acao
    )
  )
)
(TesteLoop)                                                 ;executa a funcao

