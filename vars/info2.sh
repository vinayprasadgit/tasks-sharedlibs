#!/bin/bash

sed -e '1i <test>' -e '$a</test>' catalog.xml > catalog.out

PREFIX=$(xmllint --xpath '//property[@name="prefix"]/value/text()' catalog.out)
AUTHOR=$(xmllint --xpath '//author/text()' catalog.out)

echo $AUTHOR
echo $PREFIX
