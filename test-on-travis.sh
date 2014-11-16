#!/bin/bash

sudo apt-get update -qq
sudo apt-get install -y graphviz
ls /usr/local/bin/dot
ls /usr/bin/dot
echo $PATH
dot -V
