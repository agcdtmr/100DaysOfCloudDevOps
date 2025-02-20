#!/bin/bash
echo "Enter the length of the password:"
read length
# Generate a random password containing letters, numbers, and special characters
password=$(tr -dc 'A-Za-z0-9_@#$%^&*' </dev/urandom | head -c "$length")
echo "Generated password: $password"