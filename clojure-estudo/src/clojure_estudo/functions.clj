(ns clojure-estudo.functions)

; Funcoes

(defn Funcao                                                ;declaracao da funcao
  "Exibe os valores informados"                             ;'descritivo' (javadoc)
  [x y]                                                     ;parametros esperados
  (println "valores: " x y))                                ;bloco de codigo

(Funcao 2 3)                                                ;chamada da funcao passando os parametros


(defn FuncaoSomaEdividePorDois
  "Soma dois numeros e divide o resultado por dois"
  [x y]
  (/ (+ x y) 2))

(FuncaoSomaEdividePorDois 3 5)


(defn FuncaoCalculoCombinacoes
  "Com base na entrada do numero de opcoes calcula no numero de combinacoes possiveis"
  [x]
  (* x (- x 1))
  )

(FuncaoCalculoCombinacoes 10)


; Funcoes anonimas
(defn ExecutaUmaFuncaoAnonima []
  ((fn [x] (* 2 x)) 2))                                     ;funcao anonima
(ExecutaUmaFuncaoAnonima)


(defn ExecutaUmaFuncaoAnonima2 []
  (def x ( (fn [x] (* 2 x)) 2))                                     ;funcao anonima
  (println x)
)
(ExecutaUmaFuncaoAnonima2)


(defn ExecutaUmaFuncaoAnonima3
  [v1 v2 v3]
  (println ((fn [a b c] (+ a b c)) v1 v2 v3))
  )
(ExecutaUmaFuncaoAnonima3 2 7 5)



(defn ExecutaUmaFuncaoAnonima4
  "Formula de Bhaskara"
  [v1 v2 v3]
  (println ((fn [a b c] (- (* b b) (* 4 a c))) v1 v2 v3))
  )
(ExecutaUmaFuncaoAnonima4 4 2 -6)


; Funcao com multiplos parametros

(defn FuncaoMultiplosParametros
  "Funcao que recebe 3 parametros e soma-os"
  [a b c]
  (+ a b c)
  )
(FuncaoMultiplosParametros 3 4 5)


; Variadic Functions

(defn FuncaoArgumentosVariaveis
  [nome & mensagem]
  (println "Olá " nome "," mensagem)
)
(FuncaoArgumentosVariaveis "Renan" "bem-vindo ao Clojure!" "tutorialspoint.com" "funcao com argumentos" "variaveis")


; High-Order Functions
; sao funcoes que recebem outras funcoes como argumento

(println (+ 1 (* 2 3)))

(defn FuncaoDeAltaOrdem
  "Funcao que usa como argumento outra funcao"
  [x y]
  (+ 10 (* x y))
  )
(FuncaoDeAltaOrdem 2 3)

(defn FuncaoDeAltaOrdem2
  "Funcao que usa como argumento outra funcao"
  [x]
  (defn soma1 [x] (+ 1 x))
  (soma1 x)
  )
(FuncaoDeAltaOrdem2 2)

(defn FuncaoDeAltaOrdem3
  [a b]
  (+ a b)
  )
(FuncaoDeAltaOrdem3 (+ 2 2) (+ 3 4))

(defn FuncaoDeAltaOrdem4
  [a b]
  (* (+ a b) (* a b))
  )
(FuncaoDeAltaOrdem4 (+ 2 2) (* 2 (+ 3 4)))