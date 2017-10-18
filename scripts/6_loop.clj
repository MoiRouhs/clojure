;; En Clojure for no se comporta como el ciclo de los otros lenguajes de progrmación su equivalente en este lenguaje es:

(println "==== Incremento ====")
(loop [i 0] ;; Inicialisa i en 0
	(when (<= i 5) ;; Cuando i sea menor o igual a 5 hace
  	(println i) ;; Imprime i
    (recur (inc i)) ;; recur permite sobre escribir i e inc inscrementa i en uno
	)
)

(println "==== Decremento ====")
(loop [x 5]
	(when (>= x 0)
		(println x)
		(recur (dec x)) ;; dec decrementa x en 1
	)
) 
