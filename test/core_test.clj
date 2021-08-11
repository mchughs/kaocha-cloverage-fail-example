(ns core-test
  (:require [core :as core]
            [clojure.test :refer :all]))

(deftest
  my-test
  (testing "should add two integers"
    (is (= 2 (core/add 1 1)))))
