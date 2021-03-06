#!/usr/bin/env cake run
(require '[clojure.java.io :as io])
(load-file (str (io/file (cake/*shell-env* "TM_BUNDLE_SUPPORT") "utils.clj")))
(in-ns 'textmate)
(let [tm-filepath (cake/*shell-env* "TM_FILEPATH")]
  (when (not (= tm-filepath ""))
    (attempt
      (load-file tm-filepath)
      (clojure.core/println "<pre>Loading finished.</pre>"))))