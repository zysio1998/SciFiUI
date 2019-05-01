# SciFi UI Project

Name: Arkadiusz Rybicki

Student Number: C17337523

Youtube link : https://youtu.be/PS1taW6zRjE

Fork this repository and use it a starter project for your assignment

# Description of the assignment
Its a solar system where the 8 planets are roating around the sun which is stationary. The 9 planets are shown on the left hand side in a column and when you click one, a big image appers with an interesting description of the planet clicked.

# Instructions

Click a one planet at a time. before you want to see the next one you have to UNCLICK the one you clicked otherwise it will not work

# How it works

When you click on the planet a mousePressed function detects the click of the mouse in the Perimeter defined eg. (ui.mouseX > xrect-10 && ui.mouseX < xrect +10 && ui.mouseY > (yrect*2) +30 && ui.mouseY < (yrect*2) +50). From left X -10 to Right X +10 so you have 20 pixels allowance to press it then from top Y +30 to bottom Y +50 you have 20 pixels allowance to press it too. So basically it allows you to press in the 20*20 perimeter. Once clicked a bigger image is called and displayed simuletanously the CSV is already loaded and called row by row and displayed on the screen.


# What I am most proud of in the assignment
The layout of the big image and CSV file when the images are clicked

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

