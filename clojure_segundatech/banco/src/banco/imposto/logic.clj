(ns banco.imposto.logic)

;defn- deixa a funcao privada! Apenas pode ser chamada dentro deste ns.
(defn- esta-na-faixa-isencao?
  [valor]
  (< valor 1000))

(defn imposto-retido-fonte [valor]
  (if (esta-na-faixa-isencao? valor)
    0.0
    (* valor 0.1)))

(imposto-retido-fonte 999.00)
;=> 0

(imposto-retido-fonte 1000.00)
;=> 100.0


