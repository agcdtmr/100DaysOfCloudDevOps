#!/bin/bash
echo "Enter directory path:"
read dir
find "$dir" -type f -size +100M