#!/bin/bash
echo "Enter the file to backup:"
read filename
echo "Enter the backup directory:"
read backup_dir
cp "$filename" "$backup_dir"
echo "File $filename backed up to $backup_dir"