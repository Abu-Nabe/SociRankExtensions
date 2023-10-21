import React from 'react';
import copy from 'clipboard-copy';

export const copyLink = (value) => {
    copy(value)
      .then(() => {
        alert('Text copied to clipboard!');
      })
      .catch((error) => {
        console.error('Failed to copy text: ', error);
    });
}
     


