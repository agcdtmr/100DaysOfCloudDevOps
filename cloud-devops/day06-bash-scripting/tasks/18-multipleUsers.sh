#!/bin/bash
for i in user1 user2 user3; do
    sudo useradd "$i"
    echo "$i:password123" | sudo chpasswd
done
echo "Users created successfully!"