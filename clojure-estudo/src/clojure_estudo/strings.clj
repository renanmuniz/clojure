(ns clojure-estudo.strings)

(defn strings []
  (println "Hello World")
  (def x "isso é uma string")
  (println x))
(strings)


(defn concatenar_strings [str1 str2]
  (println str1)
  (println str2)
  (println (str str1 str2))
)
(concatenar_strings "renan" "muniz")


(defn formatar_string []
  (println (format "Meu nome e': %s" "Renan"))
  (println (format "Formatando numeros: %06d" 1234))
  (println (format "Formatando numeros: %.2f" 12.34567)))
(formatar_string)


(defn contar_caracteres []
  (println (count "Renan Muniz Merlo")))
(contar_caracteres)


(defn substring []
  (println (subs "RenanMunizMerlo" 0 5))
  (println (subs "RenanMunizMerlo" 5 10))
  (println (subs "RenanMunizMerlo" 10 15))
  )
(substring)


(defn lower_upper_case []
  (println (clojure.string/lower-case "RENAN MUNIZ MERLO"))
  (println (clojure.string/upper-case "renan muniz merlo")))
(lower_upper_case)


(defn join-strings []
  "Junta em uma string so"
  (println (clojure.string/join " " ["Renan" "Muniz" "Merlo"])))
(join-strings)


(defn split_string []
  "Quebra a string de acordo com a expressao regular informada"
  (println (clojure.string/split "RenanZMunizZMerlo" #"Z")))
(split_string)


(defn split_string_em_linhas []
  "Quebra a string com base no caracter de quebra de linha \n"
  (println (clojure.string/split-lines "Renan\nMuniz\nMerlo")))
(split_string_em_linhas)


(defn split_string2 []
  "Faz o mesmo efeito que acima, especificando na expressao o caracter que quer usar para quebrar"
  (println (clojure.string/split "Renan\nMuniz\nMerlo" #"\n")))
(split_string2)


(defn inverter_string []
  (println (reverse "olreM zinuM naneR")))
(inverter_string)


(defn replace_string []
  (println (clojure.string/replace "The tutorial is about Java" #"Java" "Clojure")))
(replace_string)


(defn replace_string2 []
  (println (clojure.string/replace "Estudando Cobol" #"Java" "Clojure")))
(replace_string2)


(defn replace_string3 []
  (println (clojure.string/replace "Estudando Cobol" #"Cobol" "Clojure")))
(replace_string3)


(defn remove_espacos []
  "Trim remove espacos no comeco e final da string"
  (println (clojure.string/trim " Renan Muniz Merlo ")))
(remove_espacos)


(defn remove_espacos_a_esquerda []
  "Trim remove espacos no comeco da string"
  (println (clojure.string/triml " Renan Muniz Merlo ")))
(remove_espacos_a_esquerda)


(defn remove_espacos_a_direita []
  "Trim remove espacos no final da string"
  (println (clojure.string/trimr " Renan Muniz Merlo ")))
(remove_espacos_a_direita)