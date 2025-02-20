#!/bin/bash
echo "Enter directory name prefix:"
read name
echo "Enter start number:"
read start
echo "Enter end number:"
read end

for i in $(seq $start $end); do
    mkdir "${name}${i}"
done