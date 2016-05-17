#!/usr/bin/env sh
#
# Remove from local and remotes the branches inside
# BRANCHES array
#

BRANCHES=( 
 feature/update
 feature/update_support_23_0_1
 devel
)

for branch_name in ${BRANCHES[*]}
do
	git branch "-D" $branch_name
	git push origin :$branch_name
done

git fetch -p