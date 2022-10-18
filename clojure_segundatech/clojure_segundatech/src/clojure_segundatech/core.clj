(ns clojure-segundatech.core)

(println "Olá mundo!")
;Olá mundo!
;=> nil


;Operacoes basicas:
(+ 2 3)
; => 5

(- 10 3)
; => 7

(* 3 4)
;=> 12

(/ 10 2)
; => 5


;Vetores:
[1 2 3 4]
;=> [1 2 3 4]

["Renan" "Muniz" "Merlo"]
;=> ["Renan" "Muniz" "Merlo"]

["Renan Muniz Merlo" 1990]
;=> ["Renan Muniz Merlo" 1990]

; Contar elementos do vetor
(count ["a" "b" "c"])
;=> 3

; Adicionar elemento no vetor
(conj [1 2 3 4] 5)
;=> [1 2 3 4 5]

(conj ["Renan" "Muniz"] "Merlo")
;=> ["Renan" "Muniz" "Merlo"]

;Retornar ultimo elemento
(peek ["Renan" "Muniz" "Merlo"])
;=> "Merlo"

;Remover ultimo elemento
(pop ["Renan" "Muniz" "Merlo"])
;=> ["Renan" "Muniz"]


;Compondo funcoes:
(peek (conj ["Renan" "Muniz"] "Merlo"))
;=> "Merlo"


; Criando nossas proprias funcoes:
(defn imprimir-ola
  []
  (println "Olá"))
(imprimir-ola)
;Olá
;=> nil

(defn parabenizar
  [nome]
  (println "Seja bem-vindo ao curso de clojure!")
  (println "Parabéns " nome)
  (println "Você fez uma ótima escolha!"))
(parabenizar "Renan")
;Seja bem-vindo ao curso de clojure!
;Parabéns  Renan
;Você fez uma ótima escolha!
;=> nil

(defn somar-e-dividir-por-2
  [a b]
  (/ (+ a b) 2))
(somar-e-dividir-por-2 3 7)
;=> 5

(defn valor-multa-dois
  [valor porcentagem]
  (/ (* valor porcentagem) 100))
(valor-multa-dois 100 15)
;=> 15


;let
; let cria 'variaveis' locais para guardar dados, como por ex. os 'numeros magicos'
(defn valor-multa
  [valor]
  (let [percentual-multa 0.1]
    (* valor percentual-multa)))
(valor-multa 10000)
;=> 1000.0

(defn valor-total
  "Calcula valor total incluindo multa"
  [valor]
  (let [percentual-multa 0.1
        valor-multa (* valor percentual-multa)]
  (+ valor valor-multa)))
(valor-total 10000)
;=> 11000.0


; Predicados
; funcoes que avaliam e retornam true ou false

(even? 3)                                                   ;false
(odd? 3)                                                    ;true
(neg? -1)                                                   ;true

;if
(> 10 20)
;false

(< 10 20)
; true


(defn imposto-retido
  [salario]
  (let [imposto-primeira-faixa 0
        imposto-segunda-faixa 0.1
        imposto-terceira-faixa 0.2
        salario-primeira-faixa 1000
        salario-segunda-faixa 2000]
    (if (<= salario salario-primeira-faixa)
      imposto-primeira-faixa
      (if (< salario salario-segunda-faixa)
        (* salario imposto-segunda-faixa)
        (* salario imposto-terceira-faixa)
      )
    )
  )
)

(imposto-retido 900)
;=> 0
(imposto-retido 1000)
;=> 0
(imposto-retido 1500)
;=> 150.0
(imposto-retido 2000)
;=> 400.0
(imposto-retido 2500)
;=> 500.0
(imposto-retido -3500)
;=> 0


(defn isento-de-imposto?
  [valor]
  (<= valor 1000)
)

(isento-de-imposto? 999)
;=> true

(isento-de-imposto? 1001)
;=> false


(defn imprimir-mensagem-boas-vindas
  [idade]
  (when (>= idade 18)
    (println "Esta mensagem sera exibida apenas para usuarios")
    (println "com mais de 18 anos de idade.")
  )
)
(imprimir-mensagem-boas-vindas 18)
;Esta mensagem sera exibida apenas para usuarios
;com mais de 18 anos de idade.
;=> nil


; Testando funcoes
(defn taxa-de-entrega
  [valor-da-compra]
  (if (<= valor-da-compra 100)
    15
    (if (<= valor-da-compra 200)
      5
      0
    )
  )
)


; true, false , Truthy, Falsey
(if 1
  (println "1")
  (println "2"))
;1
;=> nil

(if -1
  (println "1")
  (println "2"))
;1
;=> nil

(if nil
  (println "1")
  (println "2"))
;2
;=> nil


;Vetores

(conj [1 2 3 4] 5)
; [1 2 3 4 5]

(pop [1 2 3 4 5])
; [1 2 3 4]

(defn desistir-ultima-compra
  [compras]
  (pop compras))

(desistir-ultima-compra ["arroz" "feijao" "banana"])
;=> ["arroz" "feijao"]

(conj nil "banana")
;=> ("banana")

(conj (conj nil "banana") "Arroz")
;=> ("Arroz" "banana")

(conj [1 2 3] nil)
;=> [1 2 3 nil]

(pop ["banana"])
;=> []

(pop [])
;Execution error (IllegalStateException) at clojure-segundatech.core/eval1825 (core.clj:239).
;Can't pop empty vector

(pop nil)
;=> nil

(defn imprime-primeiro-nome
  [nomes]
  (println (nomes 0)))

(imprime-primeiro-nome ["Renan" "Muniz" "Merlo"])
;Renan
;=> nil

(imprime-primeiro-nome [])
;Execution error (IndexOutOfBoundsException) at clojure-segundatech.core/imprime-primeiro-nome (core.clj:3).
;null

(imprime-primeiro-nome nil)
;Execution error (NullPointerException) at clojure-segundatech.core/imprime-primeiro-nome (core.clj:3).
;Cannot invoke "clojure.lang.IFn.invoke(Object)" because "nomes" is null

(defn imprime-terceiro-nome
  [nomes]
  (println (nomes 2)))

(imprime-terceiro-nome ["Renan" "Muniz" "Merlo"])
;Merlo
;=> nil

(defn imprime-primeiro-nome
  [nomes]
  (println (get nomes 0)))

(imprime-primeiro-nome ["Renan" "Muniz" "Merlo"])
;Renan
;=> nil

(imprime-primeiro-nome [])
;nil
;=> nil

(imprime-primeiro-nome nil)
;nil
;=> nil

(defn retorna-terceiro-nome
  [nomes]
  (get nomes 2 "Não encontrado"))
;get recebe 3 parametros: Lista Posição ValorDefault(opcional)

(retorna-terceiro-nome ["Renan" "Muniz" "Merlo"])
;=> "Merlo"

(retorna-terceiro-nome ["Renan"])
;=> "Não encontrado"


(defn substituir-primeiro-nome
  [nomes novo-primeiro-nome]
  (assoc nomes 0 novo-primeiro-nome))

(substituir-primeiro-nome ["Renan" "Muniz" "Merlo"] "Vinicius")
;=> ["Vinicius" "Muniz" "Merlo"]


