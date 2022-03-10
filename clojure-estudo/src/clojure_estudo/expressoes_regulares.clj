(ns clojure-estudo.expressoes-regulares)


; "regex"

(defn CriaPattern []
  (def pat (re-pattern "\\d+")))
(CriaPattern)



(defn BuscaPadraoRegex []
  (def pat (re-pattern "\\d+"))
  (println (re-find pat "abc123de")))
(BuscaPadraoRegex)



(defn ReplaceRegex []
  (def padrao (re-pattern "\\d+"))
  (def str (clojure.string/replace "abc123de" padrao "789"))
  (println str))
(ReplaceRegex)


(defn ReplacePrimeiroMatchApenas []
  "Saida: abc789de789
          abc789de123"
  (def pat (re-pattern "\\d+"))
  (def newstr1 (clojure.string/replace "abc123de123" pat "789"))
  (def newstr2 (clojure.string/replace-first "abc123de123" pat "789"))
  (println newstr1)
  (println newstr2))
(ReplacePrimeiroMatchApenas)


