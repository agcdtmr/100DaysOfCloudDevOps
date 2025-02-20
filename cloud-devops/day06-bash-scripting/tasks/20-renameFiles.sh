#!/bin/bash
for file in *.txt; do
    mv "$file" "${file%.txt}.bak"
done