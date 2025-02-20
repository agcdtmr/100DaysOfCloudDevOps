#!/bin/bash
echo "Enter process name:"
read pname
pkill -f "$pname" && echo "$pname process killed!"