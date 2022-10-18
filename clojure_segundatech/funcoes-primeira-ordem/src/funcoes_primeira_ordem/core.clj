(ns funcoes-primeira-ordem.core)

(defn imposto-retido
  "Se o salario for abaixo de 1000 reais nao tem imposto. Acima ou igual a 1000 deve aplicar
  imposto padrao."
  [salario]
  (let [imposto-padrao 0.2]
    (if (< salario 1000)
      0.0
      (* salario imposto-padrao))))


(imposto-retido 999.0)
; => 0.0

(imposto-retido 1000.0)
; => 200.0

(defn consulta-taxa-padrao-por-http
  "imagine que esse codigo pega essa informacao via API"
  []
  0.25)

(defn imposto-retido
  "Se o salario for abaixo de 1000 reais nao tem imposto. Acima ou igual a 1000 deve aplicar
  imposto padrao."
  [salario]
    (if (< salario 1000.0)
      0.0
      (* salario (consulta-taxa-padrao-por-http))))

(imposto-retido 999.0)
; => 0.0

(imposto-retido 1000.0)
; => 250.0


(defn imposto-retido
  "Se o salario for abaixo de 1000 reais nao tem imposto. Acima ou igual a 1000 deve aplicar
  imposto padrao."
  [taxa-padrao salario]
  (if (< salario 1000.0)
    0.0
    (* salario taxa-padrao)))

(imposto-retido 0.4 999.0)
; => 0.0

(imposto-retido 0.4 1000.0)
; => 250.0

(imposto-retido (consulta-taxa-padrao-por-http) 2000.0)
; => 250.0




;Usando funcoes de primeira ordem:
(defn consulta-taxa-padrao-por-http
  "imagine que esse codigo pega essa informacao via API"
  []
  (println "Iniciando consulta taxa padrão...")
  (Thread/sleep 1000)
  (println "Consultando taxa padrão...")
  (Thread/sleep 1000)
  (println "Retornando taxa padrão...")
  (Thread/sleep 1000)
  0.25)

(defn imposto-retido
  "Se o salario for abaixo de 1000 reais nao tem imposto. Acima ou igual a 1000 deve aplicar
  imposto padrao."
  [consulta-taxa-padrao salario]
  (if (< salario 1000.0)
    0.0
    (* salario (consulta-taxa-padrao))))

(imposto-retido consulta-taxa-padrao-por-http 900.00)           ;sem parentesis nos passamos a funcao como parametro e nao o resultado dela
;=> 0.0

(imposto-retido consulta-taxa-padrao-por-http 2000.00)
;Iniciando consulta taxa padrão...
;Consultando taxa padrão...
;Retornando taxa padrão...
;=> 500.0

;Se quiser fazer teste, ou implementar mockado:
(defn consulta-taxa-padrao-mock
  "MOCK: imagine que esse codigo pega essa informacao via API"
  []
  (println "[MOCK]Iniciando consulta taxa padrão...")
  (Thread/sleep 1000)
  (println "[MOCK]Consultando taxa padrão...")
  (Thread/sleep 1000)
  (println "[MOCK]Retornando taxa padrão...")
  (Thread/sleep 1000)
  0.10)

(imposto-retido consulta-taxa-padrao-mock 2000.00)



;Funcao que retorna funcao
(defn minha-taxa-padrao
  []
  consulta-taxa-padrao-mock)

(minha-taxa-padrao)
; Retorna uma referencia para a funcao:
;=>
;#object[funcoes_primeira_ordem.core$consulta_taxa_padrao_mock
;        0x7fc65f1f
;        "funcoes_primeira_ordem.core$consulta_taxa_padrao_mock@7fc65f1f"]


((minha-taxa-padrao))
; Executa e pega a referencia da funcao e depois no parentesis mais externo executa a funcao retornada
;[MOCK]Iniciando consulta taxa padrão...
;[MOCK]Consultando taxa padrão...
;[MOCK]Retornando taxa padrão...
;=> 0.1

(imposto-retido (minha-taxa-padrao) 2000.0)
; executa a (minha taxa padrao) que retorna o resultado e fica assim:
; (imposto-retido 0.10 2000.0)

;[MOCK]Iniciando consulta taxa padrão...
;[MOCK]Consultando taxa padrão...
;[MOCK]Retornando taxa padrão...
;=> 200.0

(defn escolhe-consulta-taxa-padrao
  [ambiente]
  (if (= ambiente :teste)
    consulta-taxa-padrao-mock
    consulta-taxa-padrao-por-http))

(escolhe-consulta-taxa-padrao :producao)
; Retornou a taxa por http
;#object[funcoes_primeira_ordem.core$consulta_taxa_padrao_por_http
;        0x5754f911
;        "funcoes_primeira_ordem.core$consulta_taxa_padrao_por_http@5754f911"]

(escolhe-consulta-taxa-padrao :teste)
; Retornou a mock
;#object[funcoes_primeira_ordem.core$consulta_taxa_padrao_mock
;        0x7fc65f1f
;        "funcoes_primeira_ordem.core$consulta_taxa_padrao_mock@7fc65f1f"]

(imposto-retido (escolhe-consulta-taxa-padrao :teste) 1000.0)
;[MOCK]Iniciando consulta taxa padrão...
;[MOCK]Consultando taxa padrão...
;[MOCK]Retornando taxa padrão...
;=> 100.0

(imposto-retido (escolhe-consulta-taxa-padrao :producao) 1000.0)
;Iniciando consulta taxa padrão...
;Consultando taxa padrão...
;Retornando taxa padrão...
;=> 250.0


;Funcoes anonimas
(defn dobro [x] (* 2 x))

(dobro 3)
;=> 6

;Em funcao anonima:
(fn dobro [x] (* 2 x))
;só que nao associa ela a um nome, nao sendo possivel ser 'chamada' por fora.

((fn [x] (* 2 x)) 3)
;=> 6

;Usar para coisas rápidas, como fazer um calcula que só será utilizado uma vez, etc.
;Ou passar ela como parametro para outra.


;Fomar ainda melhor de criar funcoes anonimas:
;#(* 2 %)
;# indica que é uma funcao anonima
;% é o parametro

(#(* 2 %) 4)
;=> 8

(#(+ % %)2)                                                 ;é equivalente a (+ 2 2)
;=> 4

(#(* (+ 1 %) (+ 2 %2) (+ 3 %3)) 2 3 4)                      ;é equivalente a (* (+ 1 2) (+ 2 3) (+ 3 4))
;=> 105

(#(* (+ 1 %3) (+ 2 %2) (+ 3 %1)) 2 3 4)                      ;é equivalente a (* (+ 1 4) (+ 2 3) (+ 3 2))
;=> 125

(#(+ %1 %2) 3 4)
;=> 7

;Exemplo retificando para funcao anonima
(defn calcula-imposto-de-renda
  [percentual salario]
  (* salario percentual))

(defn retorna-percentual-ir [salario]
  (if (< salario 1000.0)
    0.1
    0.27))

(calcula-imposto-de-renda (retorna-percentual-ir 10000) 10000)
;=> 2700.0

;refactor:
(defn calcula-imposto-de-renda
  [salario]
  (* salario (#(if (< salario 1000.0)
                  0.10
                  0.27))))

(calcula-imposto-de-renda 10000)
;=> 2700.0

(calcula-imposto-de-renda 900)
;=> 90.0




