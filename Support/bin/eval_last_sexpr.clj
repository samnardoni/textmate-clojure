#!/usr/bin/env cake run
(require '[clojure.java.io :as io])
(load-file (str (io/file (cake/*shell-env* "TM_BUNDLE_SUPPORT") "utils.clj")))
(in-ns 'textmate)
(display-form-eval (get-last-sexpr))