(ns clojure-estudo.arquivos)

(defn LerArquivo1 []
  "Le o arquivo todo em uma so string"
  (def string (slurp "resources/files/exemplo.txt"))
  (println string))
(LerArquivo1)


(defn EscreverEmArquivo1 []
  (spit "resources/files/exemplo2.txt"
        "Escrevendo em arquivo."))
(EscreverEmArquivo1)