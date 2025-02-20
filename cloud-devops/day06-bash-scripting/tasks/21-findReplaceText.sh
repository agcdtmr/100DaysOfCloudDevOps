#!/bin/bash
echo "Enter filename:"
read file
echo "Enter text to replace:"
read old
echo "Enter new text:"
read new
sed -i "s/$old/$new/g" "$file"
echo "Text replaced!"