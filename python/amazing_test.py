import amazing
import random
import unittest

class TestAmazing(unittest.TestCase):

    def testSeed0size15x20(self):
        expected = """Amazing - Copyright by Creative Computing, Morristown, NJ
:--:--:--:--:--:--:--:--:--:--:--:--:--:  :--:
I     I                                I     I 
:  :--:  :  :--:  :--:--:--:--:--:--:--:--:  :
I  I     I     I     I           I     I     I 
:  :  :--:--:  :--:  :  :--:--:  :  :  :  :--:
I  I        I     I  I  I     I     I  I     I 
:  :--:--:  :--:  :  :  :  :  :--:--:  :--:  :
I     I     I  I  I     I  I        I        I 
:--:  :  :--:  :  :  :--:  :--:--:  :--:--:--:
I  I     I  I     I     I  I        I     I  I 
:  :--:--:  :  :--:  :  :  :  :--:--:  :  :  :
I              I     I  I  I     I  I  I     I 
:--:--:--:--:--:  :--:  :  :  :  :  :  :--:--:
I     I  I        I  I     I  I     I        I 
:  :  :  :  :  :  :  :  :--:--:--:--:--:--:  :
I  I     I  I  I  I     I     I     I        I 
:  :  :--:  :  :  :--:--:  :  :  :  :  :--:--:
I  I  I  I  I  I           I  I  I  I  I     I 
:  :  :  :  :--:  :--:--:--:  :  :  :  :  :  :
I  I     I     I        I     I  I  I     I  I 
:  :--:--:--:  :  :  :  :--:  :  :--:  :--:  :
I              I  I  I     I  I     I  I  I  I 
:--:--:--:  :--:  :--:--:  :--:  :  :  :  :  :
I        I  I     I           I  I  I  I     I 
:  :  :  :--:  :--:  :  :--:  :  :  :  :--:--:
I  I  I        I     I     I     I           I 
:  :  :--:--:--:  :--:--:--:--:--:--:--:--:--:
I  I     I     I        I     I              I 
:  :--:  :--:  :  :--:  :  :  :  :--:--:--:  :
I     I        I     I     I  I  I  I        I 
:--:--:--:  :--:--:--:--:--:  :  :  :  :  :--:
I        I     I     I     I  I  I     I     I 
:--:  :  :--:  :  :  :  :  :  :--:  :--:--:  :
I     I  I        I     I  I        I     I  I 
:  :--:--:  :--:--:--:--:  :--:--:--:  :--:  :
I        I        I     I     I     I  I     I 
:  :--:  :--:--:  :--:  :  :  :  :  :  :  :--:
I     I     I  I     I     I     I     I  I  I 
:--:  :--:  :  :--:  :  :--:--:--:--:--:  :  :
I        I           I                 I     I 
:--:--:--:--:--:--:--:--:--:--:--:--:--:  :--:
"""
        random.seed(0)
        amazing.doit(15, 20)
        self.assertEqual(expected, amazing.result)

    def testSeed100size4x5(self):
        expected = """Amazing - Copyright by Creative Computing, Morristown, NJ
:  :--:--:--:
I           I 
:  :--:  :  :
I     I  I  I 
:--:  :  :  :
I  I  I  I  I 
:  :  :--:  :
I  I     I  I 
:  :  :  :  :
I     I  I  I 
:--:--:  :--:
"""
        random.seed(102)
        amazing.doit(4, 5)
        self.assertEqual(expected, amazing.result)
