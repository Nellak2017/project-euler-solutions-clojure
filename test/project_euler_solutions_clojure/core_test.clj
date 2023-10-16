(ns project-euler-solutions-clojure.core-test
  (:require [clojure.test :refer :all]
            [project-euler-solutions-clojure.core :refer :all]))

(deftest test-multiples-sum-below-1000
  (testing "Test for calculating the sum of multiples of 3 or 5 below 1000"
    (is (= 23 (multiples-sum-below-n 10)))))

(run-tests)