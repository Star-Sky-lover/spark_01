#!/usr/bin/env bash

bin=$(dirname "${BASH_SOURCE-$0}")
echo "$bin"
bin=$(cd "$bin" || exit; pwd)
echo "$bin"
DEFAULT_LIBEXEC_DIR="$bin"/../libexec
echo "$DEFAULT_LIBEXEC_DIR"
HADOOP_LIBEXEC_DIR=${HADOOP_LIBEXEC_DIR:-$DEFAULT_LIBEXEC_DIR}
echo "$HADOOP_LIBEXEC_DIR"
#. $HADOOP_LIBEXEC_DIR/hdfs-config.sh
echo `. b.sh`
bin=`which "$0"`
echo "$bin"
bin=`dirname "$bin"`
echo "$bin"
bin=`cd "$bin"; pwd`
echo "$bin"
if [ -e a.sh ]; then echo 1; else echo 2; fi

