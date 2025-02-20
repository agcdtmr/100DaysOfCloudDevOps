#!/bin/bash
find /var/log -name "*.log" -type f -mtime +7 -exec rm -f {} \;
echo "Old log files deleted."