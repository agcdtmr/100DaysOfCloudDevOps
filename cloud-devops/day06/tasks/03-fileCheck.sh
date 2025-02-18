#!/bin/bash
echo "Enter filename:"
read file
if [ -e "$file" ]; then
    echo "File exists"
else
    echo "File does not exist"
fi