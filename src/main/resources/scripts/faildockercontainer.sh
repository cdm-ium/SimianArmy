#!/bin/bash
# Script to kill docker containers on a box
# for now just hardcode kill peoples

cat << EOF > /tmp/docker_kill.sh
#!/bin/bash

sudo stop peoples
EOF

nohup /bin/bash /tmp/docker_kill.sh &
