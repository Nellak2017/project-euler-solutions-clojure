(ns project-euler-solutions-clojure.core)

;; Project Euler Problem #1

;; returns the multiples of a up to n
;; example: multiples of 3 up to 10 => multiples [3 10] -> 3,6,9
(defn multiple [a n]
  (take-while #(< % n) (iterate #(+ % a) a)))

;; adds up all numbers in a list
(defn sum [lst]
  (apply + lst))

;; returns the multiples of 3 and 5 up to n
(defn multiples-sum-below-n [n]
  (sum
    (distinct
      (concat (multiple 3 n) (multiple 5 n)))))

(println (multiples-sum-below-n 1000))