(ns clojure-estudo.excecoes)


(defn Example1 []
  (def string (slurp "Example.txt"))
  (println string))
(Example1)

(defn Example2 []
  (try
    (aget (int-array [1 2 3]) 5)
    (catch Exception e (println (str "caught exception: " (.toString e))))
    (finally (println "This is our final block")))
  (println "Let's move on"))
(Example2)

(defn PegarExcecao []
  (try
  (def string (slurp "naoexiste.txt"))
  (catch java.io.FileNotFoundException ex (println (str "Arquivo não encontrado. " (.getMessage ex)) ))
  (catch Exception ex (println (str "Erro inesperado: " (.getMessage ex)) ))
  (finally (println "Continuando fluxo...")))
)
(PegarExcecao)