import argparse

my_parser = argparse.ArgumentParser(prog="xkcdpwgen", description="Generate secure and memorable passwords")
my_parser.add_argument("-w", "--words", type=int, default='4', help='include WORDS words in the password (default=4)')
my_parser.add_argument("-c", "--caps", type=int, default='0', help='capitalize the first letter of CAPS random words (default=0)')
my_parser.add_argument("-n", "--numbers", type=int, default='0', help='insert NUMBERS random numbers in the password (default=0)')
my_parser.add_argument("-s", "--symbols", type=int, default='0', help='insert SYMBOLS random symbols in the password (default=0)')
my_args = my_parser.parse_args()