try:
    import Image
except ImportError:
    from PIL import Image
import pytesseract
import os
f2 = os.path.abspath('title_arkansas.jpg')
col = Image.open(f2)
gray = col.convert('L')
bw = gray.point(lambda x: 0 if x<150 else 250, '1')
bw.save("tmp.jpg")
print(pytesseract.image_to_string(Image.open('tmp.jpg')))
