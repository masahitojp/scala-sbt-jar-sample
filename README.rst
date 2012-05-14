Scala + sbt で standalone jar ファイルを作成する例
=======================================================

* Scala 2.9.2
* sbt 0.11.3
* sbt-assembly-plugin

コマンド
----------  

::

   $ sbt
   > assembly

<project-folder>/target/<name>-<version>.jar というファイルができる。

::

  $ java -cp ファイル名 パッケージ名.クラス名で実行
