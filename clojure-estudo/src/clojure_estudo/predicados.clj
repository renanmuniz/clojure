(ns clojure-estudo.predicados)

; sao funcoes que avaliam uma condicao e retornam true ou false

(defn Example []
  (def x (even? 0))
  (println x)

  (def x (neg? 2))
  (println x)

  (def x (odd? 3))
  (println x)

  (def x (pos? 3))
  (println x))
(Example)


;every-pred
;retorna true se todas as avaliacoes forem true
(defn everypred []
  (println ((every-pred number? even?) 2 4 6))
  (println ((every-pred number? odd?) 2 4 6)))
(everypred)


(defn maiorQue10 [x]
  (> x 10))
(maiorQue10 5)

(defn everypred2 []
  (println ((every-pred number? even? maiorQue10) 12 14 16)))
(everypred2)



;every
; retorna true se TODOS os valores satisfazerem aquela condicao
(defn every []
  (println (every? even? '(2 4 6)))
  (println (every? odd? '(1 3 6))))
(every)

;some
; retorna true se ALGUM dos itens satisfazer a condicao
(defn some1 []
  "Par?"
  (println (some even? '(1 3 5 7 8))))
(some1)

(defn some2 []
  "Impar?"
  (println (some odd? '(2 4 6 7))))
(some2)



;not-any
; retorna true se NENHUM dos itens satisfazer a condicao

(defn notany1 []
  "Par?"
  (println (not-any? even? '(1 3 5))))
(notany1)

(defn notany2 []
  "Par?"
  (println (not-any? even? '(1 3 5 6))))
(notany2)