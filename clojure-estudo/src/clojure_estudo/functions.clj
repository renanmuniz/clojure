(ns clojure-estudo.functions)

; Functions

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

